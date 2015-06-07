<x><![CDATA[

	declare namespace wses="http://www.esbforchis.it/wsEsbSearchByPlace";
	declare variable $input as document-node() external;
	 
     <wses:getImagesOutput>
      {for $x in $input//*:immagine
	   return
            <image>
            <url>{data($x/*:url)}</url>
            <caption>{data($x/*:didascalia)}</caption>
            </image>	 
	  }
	  <errorCode>{
            if(string-length(data($input//*:immagine[1]/*:url))>0) 
            then '0'
            else '4'}</errorCode>
        <errorDescription>{
            if(string-length(data($input//*:immagine[1]/*:url))>0) 
            then ''
            else 'No Data Found'}</errorDescription>
      </wses:getImagesOutput>

	]]>
</x>