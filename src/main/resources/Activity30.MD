## Feature: Signup page

### Scenario 1: User tries creates an account filling all fields correctly
    1. Given: The user is in the Signup page
    2. When:  Fills all fields correctly
    3. And:   Clicks on "Cadastrar" button
    4. Then:  A successful message should appear saying that the user was successfully registered

### Scenario 2: User tries to create an account without filling a required field
    1. Given: The user is in the Signup page
    2. When:  A required field is not filled
    3. And:   Clicks on "Cadastrar" button
    4. Then:  An error message should be displayed to the user, saying that all required fields must be field

### Scenario 3: User tries to create an account with a non-valid password
    1. Given: The user is in the Signup page
    2. When:  Fills all required fields and enters N characters in the password field
    3. And:   Clicks on "Cadastrar" button
    4. Then   An error message should be displayed sayint that the password must have between 4 and 10 characters
    Example (N): 3, 11