<x><![CDATA[

	declare namespace wses="http://www.esbforchis.it/wsEsbSearchByPlace";
	declare variable $input as document-node() external;
	 
	
	 <wses:getTwitterResultOutput>
    { for $x in $input//*:statuses
return
  <twitterResult>{
concat('@',
$x/user/screen_name/text(),
' scrive: ', $x/text/text(), ' (', $x/user/created_at/text(),')')}</twitterResult>
       }
      </wses:getTwitterResultOutput>

	]]>
</x>