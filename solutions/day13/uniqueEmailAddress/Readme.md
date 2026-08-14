To solve this problem, we need to normalize the local names of the email addresses while keeping the domain names intact. The steps are:

1. Split each email address into local and domain parts using @.
2. Handle the local name:
 a. Ignore everything after +.
 b. Remove all . characters.
3. Combine the modified local name with the original domain name.
4. Use a HashSet to store all unique email addresses. HashSet is used because it automatically handles duplicates.
5. Return the size of the HashSet as the result.