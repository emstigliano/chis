<x><![CDATA[

	declare namespace wses="http://www.esbforchis.it/wsEsbSearchByPlace";
	declare variable $input as document-node() external;
	 
	<wses:getOtherInfoOutput>
	
	 
	 	 <couple>
            <key>Nome</key>
            <value>{$input//*:identifier/text()}</value>
         </couple>
         <couple>
            <key>Categoria</key>
            <value>{$input//*:categoria/text()}</value>
         </couple>
         <couple>
            <key>Indirizzo</key>
            <value>{$input//*:indirizzo/text()}</value>
         </couple>
         <couple>
            <key>Comune</key>
            <value>{$input//*:comune/text()}</value>
         </couple>
         <couple>
            <key>Provincia</key>
            <value>{$input//*:provincia/text()}</value>
         </couple>
         <couple>
            <key>Regione</key>
            <value>{$input//*:regione/text()}</value>
         </couple>
	   <couple>
            <key>Posizione (latitudine, longitudine)</key>
            <value>{concat($input//*:latitudine/text(),', ',$input//*:longitudine/text())}</value>
         </couple>
	  	<errorCode>0</errorCode>
        <errorDescription/>
      </wses:getOtherInfoOutput>
      
	]]>
</x>