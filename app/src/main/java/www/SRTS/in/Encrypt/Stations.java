package www.SRTS.in.Encrypt;

/**
 * Created by Harshit on 26-Jan-18.
 */

public class Stations {
    String[] allStations;

    public Stations(){
        allStations= new String[]{
                "AIROLI", "AMBERNATH", "AMBIVLI", "ANDHERI", "ASANGAON", "ATGAON", "BADLAPUR", "BAMAN DONGARI", "BANDRA", "BHANDUP", "BHAYANDAR", "BHIVPURI ROAD", "BHIWANDI", "BOISAR", "BORIVALI", "BYCULLA", "CBD BELAPUR", "CHARNI ROAD", "CHEMBUR", "CHHATRAPATI SHIVAJI MAHARAJ TERMINUS", "CHINCHPOKLI", "CHUNABHATTI", "CHURCHGATE", "COTTON GREEN", "CURREY ROAD", "DADAR CENTRAL & DADAR WESTERN", "DAHANU ROAD", "DAHISAR", "DATIVALI", "DIVA", "DOCKYARD ROAD", "DOLAVLI", "DOMBIVLI", "PRABHADEVI", "GAVAN", "GHANSOLI", "GHATKOPAR", "GOREGAON", "GOVANDI", "GRANT ROAD", "GURU TEGH BAHADUR NAGAR", "JOGESHWARI", "JUCHANDRA", "JUINAGAR", "KALAMBOLI", "KALWA", "KALYAN", "KAMAN ROAD", "KANDIVALI", "KANJURMARG", "KARJAT", "KASARA", "KELAVLI", "KELVE ROAD", "KHADAVLI", "KHANDESHWAR", "KHAR ROAD", "KHARBAO", "KHARDI", "KHARGHAR", "KHARKOPAR", "KHOPOLI", "KING'S CIRCLE", "KOPAR", "KOPAR KHAIRANE", "KURLA", "LOWER PAREL", "LOWJEE", "MAHALAXMI", "MAHIM", "MALAD", "MANKHURD", "MANSAROVAR", "MARINE LINES", "MASJID", "MATUNGA", "MATUNGA ROAD", "MUMBAI CENTRAL", "MIRA ROAD", "MUMBRA", "NAHUR", "NAIGAON", "NALLASOPARA", "NERAL", "NERUL", "NAVADE ROAD", "NHAVA SHEVA", "NILAJE", "PALGHAR", "PALASDARI", "PANVEL", "PAREL", "RABALE", "RAM MANDIR", "RANJANPADA", "ROHA", "SAGAR SANGAM", "SANDHURST ROAD", "SANPADA", "SANTACRUZ", "SEAWOODS–DARAVE", "SAPHALE", "SION", "SHAHAD", "SHELU", "THANSIT", "TARGHAR", "THANE", "THAKURLI", "TITWALA", "TURBHE", "ULHASNAGAR", "UMBERMALI", "UMROLI", "URAN CITY", "WADALA ROAD", "VAITARNA", "VANGAON", "VANGANI", "VASAI ROAD", "VASHI", "VASIND", "VIDYAVIHAR", "VIKHROLI", "VILE PARLE", "VIRAR", "VITHALWADI", "MULUND", "TILAK NAGAR", "SEWRI", "TALOJA", "PEN", "RASAYANI", "NAGOTHANE"
        };
    }

    public boolean contains(String Code){
        for(int i=0;i<allStations.length;i++){
            if(Code.substring(2).equals(allStations[i]))
                return true;
        }
        return false;
    }
}
