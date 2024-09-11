### Solution Approach

Lets assume longer string be s1 and shorter string be s2 
In order to be similar senetences 
- Complete s2 should be a prefix of s1
  
Ex: s1 = ["My","Name","is","Rock"] s2 = ["My","Name"]
- Complete s2 should be a suffic of s2

 Ex: s1 = ["My","Name","is","Rock"] s2 = ["is","Rock"]
- Entire s2 should be sum of longest matching prefix and longest Matching suffix 

Ex: s1 = ["My","Name","is","Rock"] s2 = ["My","Rock"]

Longest Matching Prefix pf: "My"

Longest Mathcing Suffix sf: "Name"

pf+sf == s2

In any other cases it will not be a similar senetences



use stringstream to build a stream of characters and split the words based on whitespace (you can use any other utils as well)
use two pointers to find longest matching prefix and suffixe lengths and 
check if it length of sums greater than or equal to length of s2

### Time complexity:
- O(∣sentence1∣+∣sentence2∣)

### Space complexity:
- O(∣sentence1∣+∣sentence2∣)

### Tags
Two Pointer , Strings 
