#Vauhtio template Spring project

###REST Controller
Rest endpointit on projektissa luokassa `VauhtioRestController`

Luokka esittelee variaatiot:
1. pelkkä GET ilman parametreja
1. GET url polkumuuttujalla
1. GET requst pararametreilla (?name=value&next=param)
1. POST Json datalla
1. HTTP Basic autentikaatiolla suojattu GET

###Spring security
Spring security on konfiguroitu projektissa luokassa `WebSecurityConfig`
Testaa seuraavat variaatiot:
1. selaimella suojaamaton URL vastaa ilman autentikaatiota
http://localhost:8080/
1. selaimella uusi ikkkuna incognito modella; navigoi http://localhost:8080/secure/sensitive ja anna kt:ss admin:admin
1. tekninen kutsu ilman tunnuksia; `curl -i http://localhost:8080/secure/sensitive`
    1. palauttaa 401 Unauthorized
1. tekninen kutsu the-easy-way; `curl -i --user admin:admin http://localhost:8080/secure/sensitive`
1. tekninen kutsu the-hard-and-real-way:
    1. mene https://www.base64encode.org ja syötä kenttään admin:admin (huomaa kaksoispiste kuuluu mukaan)
    1. paina Encode
    1. kopioi base64 enkoodattu teksti (YWRtaW46YWRtaW4=)
    1. `curl -i -H "Authorization: Basic YWRtaW46YWRtaW4=" http://localhost:8080/secure/sensitive`

Viimeisessä esimerkissä nähtiin miten Authorization Headeriin oli laitettu enkoodattuna käyttäjätunnus:salasana. 
HUOM! Älä koskaan käytä https://www.base64encode.org linkkiä minkään tuotantodatan enkoodaamiseen, harjoituskäyttäjät ok.
Tämä siitä syystä että tulet lähettäneeksi tiedot palveluntarjoajalle ja emme voi varmistua mitä datalla tehdään.