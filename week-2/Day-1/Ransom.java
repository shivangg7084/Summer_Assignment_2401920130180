public class Ransom {
        public boolean canConstruct(String ran, String mag) {
            int[] count = new int[26];
            for(int i = 0; i< mag.length(); i++){
                count[mag.charAt(i) - 'a']++;
            }
            for(int i = 0; i < ran.length(); i++){
                count[ran.charAt(i) - 'a']--;
                if(count[ran.charAt(i) - 'a'] < 0){
                    return false;
                }
            }
            return true;
        }

}
