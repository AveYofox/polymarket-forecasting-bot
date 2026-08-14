package uniqueEmailAddress;

import java.util.HashSet;
// 929. Unique Email Addresses

public class Solution {

    public int uniqueEmail(String[] emails){
        HashSet<String> hs = new HashSet<>();
        int n = emails.length;

        for(int i=0;i<n;i++){
            String[] parts = emails[i].split("@");
            String local = parts[0];
            String domain = parts[1];

            if(local.contains("+")){
                local = local.substring(0,local.indexOf("+"));
            }
            local = local.replace(".","");
            String normalizedEmail = local + "@" + domain;
            hs.add(normalizedEmail);
        }

        return hs.size();
    }


}
