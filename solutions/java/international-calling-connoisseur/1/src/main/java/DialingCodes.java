import java.util.Map;
import java.util.HashMap;


public class DialingCodes {

    private Map<Integer, String>  dCodes = new HashMap<>();

    public Map<Integer, String> getCodes() {
       return this.dCodes;
    }

    public void setDialingCode(Integer code, String country) {
       this.dCodes.put(code, country);
    }

    public String getCountry(Integer code) {
        return this.dCodes.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if(!this.dCodes.containsKey(code) && !this.dCodes.containsValue(country)){
            this.dCodes.put(code, country);
        }
    }

    public Integer findDialingCode(String country) {
        for(Map.Entry<Integer, String> entry: this.dCodes.entrySet()) {
            if(entry.getValue().equals(country)){
                return entry.getKey();
            }
        }
        return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        if(this.dCodes.containsValue(country)) {
            this.dCodes.remove(findDialingCode(country));
            this.dCodes.put(code, country);
        }
    }
}
