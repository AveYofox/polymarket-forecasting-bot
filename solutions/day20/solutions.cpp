class Solution {
public:
    bool parseBoolExpr(string expression) {
     stack<char> s;

        for (char currChar : expression) {
            if (currChar == ',' || currChar == '(')
                continue;  
            if (currChar == 't' || currChar == 'f' || currChar == '!' ||
                currChar == '&' || currChar == '|') {
                s.push(currChar);
            }
            else if (currChar == ')') {
                bool hasTrue = false, hasFalse = false;

                while (s.top() != '!' && s.top() != '&' && s.top() != '|') {
                    char topValue = s.top();
                    s.pop();
                    if (topValue == 't') hasTrue = true;
                    if (topValue == 'f') hasFalse = true;
                }
                char op = s.top();
                s.pop();
                if (op == '!') {
                    s.push(hasTrue ? 'f' : 't');
                } else if (op == '&') {
                    s.push(hasFalse ? 'f' : 't');
                } else {
                    s.push(hasTrue ? 't' : 'f');
                }
            }
        }
        return s.top() == 't';
    }
};
