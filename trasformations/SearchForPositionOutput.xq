<x><![CDATA[

	declare namespace wses="http://www.esbforchis.it/wsEsbSearchTools";
	declare variable $input as document-node() external;
	 
	
	 <wses:searchForPositionOutput>

	 {	for $x in $input//*:response/*:scanEntityResponse
	 	return
            <place>{data($x/rowkey)}</place>
	 
	 }	
	 	 </wses:searchForPositionOutput>
	]]>
</x>