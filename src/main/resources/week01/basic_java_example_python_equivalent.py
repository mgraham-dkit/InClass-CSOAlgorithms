def get_valid_age() -> int:
    valid_age = False
    while not valid_age:
        try:
            age = int(input("Please enter your age: "))
            valid_age = True
        except ValueError as e:
            print("Please enter a NUMBER.")

    return age


for i in range(5):
    name = input("Please enter your username: ")
    age = get_valid_age()