
### Code Review 👩🏾‍💻💾

1. Code does not pass testing.
    ```
    - Input:
        100
        101
        10101
        33
        10


    - Output:
        false
        false
        false
        false
        false 
        ```

2. The ``` while ``` loop states the variabe ``` num != x ``` however we only want this condition to stop when ``` num ``` is equal to 0. This impacts the logic of the algorithm and subsequently the output. I suggest making this before the pull request for the commit is approved.

3. Spelling error line 11.
```
11.       reversd = 0
```

4. Where possible,e.g. lines 15-16,20-21, convert to multi line comment. This has little to no impact on the code other than making it fit the prescribe style conventions and being more efficient. 




#### Comments

This is well written code. The logic aims to efficiently address the challenge. It uses a minimal amount of memory and has a fair runtime given the problem, 48ms.
Code should be tested before submission/pushed to be sure it has the desired outcome. I was unable to understnad the explanation of the logic in the comments from lines 5-9. 
All suggested changes can be taken care of within ~30mins < less.


##### Notes

- Check for spell errors.
- Rearrange the order of the code review numbers e.g. 2 must go to bottom due to priority.
