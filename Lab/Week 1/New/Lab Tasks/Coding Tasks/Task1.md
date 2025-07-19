# Task 1
---

## Question

---

Find out which of the following are legal identifiers in Java, and which are not. Also, explain why the invalid ones are invalid. 

You can try to define each of these (items a to k below) as a variable in the DrJava interaction pane and find out.

**Example:** If you want to define `hungry`, you have to try:
```java
int hungry;
```
---

## Solution
---


| Item | Identifier | Status | Explanation |
|------|------------|--------|-------------|
| a) | `hungry` | ✅ **VALID** | Follows all Java identifier rules |
| b) | `2AB` | ❌ **INVALID** | Identifier cannot start with a number |
| c) | `321.2` | ❌ **INVALID** | Identifier cannot start with a number and cannot contain a dot (.) |
| d) | `MOBILE` | ✅ **VALID** | Follows all Java identifier rules |
| e) | `"Ans"` | ❌ **INVALID** | Identifier cannot contain quotes or start with special characters other than `_` or `$` |
| f) | `$30` | ✅ **VALID** | Dollar sign ($) is allowed at the beginning |
| g) | `Yes/No` | ❌ **INVALID** | Identifier cannot contain a forward slash (/) |
| h) | `student-id` | ❌ **INVALID** | Identifier cannot contain a hyphen (-) |
| i) | `A+3` | ❌ **INVALID** | Identifier cannot contain a plus sign (+) |
| j) | `'X'` | ❌ **INVALID** | Identifier cannot contain single quotes |
| k) | `return` | ❌ **INVALID** | `return` is a reserved keyword in Java |

