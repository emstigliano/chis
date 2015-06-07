<x><![CDATA[

	declare namespace wses="http://www.esbforchis.it/wsEsbWeatherInformation";
	declare variable $input as document-node() external;
	
	
	 <wses:getWeaterInformationOutput>
	{	for $x in $input//*:item/*:forecast
	 	return
         (<info>
            <date>{
replace(
replace(
replace(
replace(
replace(
replace(
replace(
replace(
replace(
replace(
replace(data($x/@date),'Jan','gennaio')
,'Feb','febbraio')
,'Mar','marzo')
,'Apr','aprile')
,'May','maggio')
,'Jun','giugno')
,'Jul','luglio')
,'Aug','agosto')
,'Sep','settembre')
,'Nov','novembre')
,'Dec','dicembre') 
            }</date>
            <day>{
replace(
replace(
replace(
replace(
replace(
replace(
replace(data($x/@day),'Mon','lunedì')
,'Tue','martedì')
,'Wed','mercoledì')
,'Thu','giovedì')
,'Fri','venerdì')
,'Sat','sabato')
,'Sun','domenica')
			}</day>
            <high>{xs:int((xs:int(data($x/@high))-32) div 1.8000)}</high>
            <low>{xs:int((xs:int(data($x/@low))-32) div 1.8000)}</low>
            <text>
{

if(xs:int(data($x/@code))= 0	) then	'tornado'			    else ''}{
if(xs:int(data($x/@code))= 1	) then	'tempesta tropicale'                else ''}{
if(xs:int(data($x/@code))= 2	) then	'uragano'                           else ''}{
if(xs:int(data($x/@code))= 3	) then	'forti temporali'                   else ''}{
if(xs:int(data($x/@code))= 4	) then	'temporali'                         else ''}{
if(xs:int(data($x/@code))= 5	) then	'pioggia e neve'                    else ''}{
if(xs:int(data($x/@code))= 6	) then	'pioggia e nevischio'               else ''}{
if(xs:int(data($x/@code))= 7	) then	'neve e nevischio'                  else ''}{
if(xs:int(data($x/@code))= 8	) then	'pioggia fine e fredda'             else ''}{
if(xs:int(data($x/@code))= 9	) then	'pioggia fine'                      else ''}{
if(xs:int(data($x/@code))= 10	) then	'pioggia fredda'                    else ''}{
if(xs:int(data($x/@code))= 11	) then	'rovesci temporaleschi'             else ''}{
if(xs:int(data($x/@code))= 12	) then	'rovesci temporaleschi'             else ''}{
if(xs:int(data($x/@code))= 13	) then	'raffiche di neve'                  else ''}{
if(xs:int(data($x/@code))= 14	) then	'rovesci di neve '                  else ''}{
if(xs:int(data($x/@code))= 15	) then	'folate di neve'                    else ''}{
if(xs:int(data($x/@code))= 16	) then	'neve'                              else ''}{
if(xs:int(data($x/@code))= 17	) then	'grandine'                          else ''}{
if(xs:int(data($x/@code))= 18	) then	'nevischio'                         else ''}{
if(xs:int(data($x/@code))= 19	) then	'polveri'                           else ''}{
if(xs:int(data($x/@code))= 20	) then	'nebbia'                            else ''}{
if(xs:int(data($x/@code))= 21	) then	'foschia'                           else ''}{
if(xs:int(data($x/@code))= 22	) then	'foschia e nebbia'                  else ''}{
if(xs:int(data($x/@code))= 23	) then	'ventoso'                           else ''}{
if(xs:int(data($x/@code))= 24	) then	'ventoso'                           else ''}{
if(xs:int(data($x/@code))= 25	) then	'freddo'                            else ''}{
if(xs:int(data($x/@code))= 26	) then	'nuvoloso'                          else ''}{
if(xs:int(data($x/@code))= 27	) then	'sereno'                            else ''}{
if(xs:int(data($x/@code))= 28	) then	'sereno'                            else ''}{
if(xs:int(data($x/@code))= 29	) then	'parzialmente nuvoloso'             else ''}{
if(xs:int(data($x/@code))= 30	) then	'parzialmente nuvoloso'             else ''}{
if(xs:int(data($x/@code))= 31	) then	'sereno'                            else ''}{
if(xs:int(data($x/@code))= 32	) then	'sole'                              else ''}{
if(xs:int(data($x/@code))= 33	) then	'sereno'                            else ''}{
if(xs:int(data($x/@code))= 34	) then	'sereno'                            else ''}{
if(xs:int(data($x/@code))= 35	) then	'pioggia mista a grandine'          else ''}{
if(xs:int(data($x/@code))= 36	) then	'caldo'                             else ''}{
if(xs:int(data($x/@code))= 37	) then	'temporali isolati'                 else ''}{
if(xs:int(data($x/@code))= 38	) then	'temporali sparsi'                  else ''}{
if(xs:int(data($x/@code))= 39	) then	'temporali sparsi'                  else ''}{
if(xs:int(data($x/@code))= 40	) then	'rovesci sparsi'                    else ''}{
if(xs:int(data($x/@code))= 41	) then	'neve abbondante'                   else ''}{
if(xs:int(data($x/@code))= 42	) then	'rovesci di neve sparsi'            else ''}{
if(xs:int(data($x/@code))= 43	) then	'neve abbondante'                   else ''}{
if(xs:int(data($x/@code))= 44	) then	'parzialmente nuvoloso'             else ''}{
if(xs:int(data($x/@code))= 45	) then	'rovesci temporaleschi'             else ''}{
if(xs:int(data($x/@code))= 46	) then	'rovesci di neve'                   else ''}{
if(xs:int(data($x/@code))= 47	) then	'isolati rovesci temporaleschi'     else ''}{
if(xs:int(data($x/@code))= 3200	) then	'non disponibile'                   else ''
       }</text>
         </info>)
    }
    
      	
        <errorCode>{
            if(string-length(data($input//*:item/*:forecast[1]/@date))>0) 
            then '0'
            else '4'}</errorCode>
        <errorDescription>{
            if(string-length(data($input//*:item/*:forecast[1]/@date))>0) 
            then ''
            else 'No Data Found'}</errorDescription>
      
	
		
       
         
	 	 </wses:getWeaterInformationOutput>
	]]>
</x>