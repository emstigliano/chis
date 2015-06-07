<x><![CDATA[

	declare namespace wses="http://www.esbforchis.it/wsEsbSearchByPlace";
	declare variable $input as document-node() external;
	 
	<wses:getDescriptionsOutput>
	    <description>{data($input//*:descrizione)}</description>
	 	<errorCode>{
            if(string-length(data($input//*:descrizione))>0) 
            then '0'
            else '4'}</errorCode>
        <errorDescription>{
            if(string-length(data($input//*:descrizione))>0) 
            then ''
            else 'No Data Found'}</errorDescription>
      </wses:getDescriptionsOutput>
      
	]]>
</x>