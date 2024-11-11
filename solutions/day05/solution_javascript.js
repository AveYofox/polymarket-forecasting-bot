/**
 * @param {string} s1
 * @param {string} s2
 * @return {boolean}
 */
var checkInclusion = function(s1, s2) {
    const areVectorsEqual = (a, b) => {
        for (let i = 0; i < 26; i++) {
            if (a[i] !== b[i]) return false;
        }
        return true;
    };

    if (s2.length < s1.length) return false;
    
    let f1 = new Array(26).fill(0); // f1 is the frequency array for s1
    for (let char of s1) {
        f1[char.charCodeAt(0) - 'a'.charCodeAt(0)]++;
    }
    
    let f2 = new Array(26).fill(0); // f2 is the frequency array for the sliding window in s2
    let i = 0, j = 0;
    
    while (j < s2.length) {
        f2[s2[j].charCodeAt(0) - 'a'.charCodeAt(0)]++;
        
        if (j - i + 1 === s1.length) {
            if (areVectorsEqual(f1, f2)) return true;
        }
        
        if (j - i + 1 < s1.length) {
            j++;
        } else {
            f2[s2[i].charCodeAt(0) - 'a'.charCodeAt(0)]--;
            i++;
            j++;
        }
    }
    
    return false;
};
