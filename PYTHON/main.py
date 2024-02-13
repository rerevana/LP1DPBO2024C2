from Human import Human

rain = Human()
rain.set_name("Rain")
rain.set_gender('L')

techi = Human("Techi", 'P')

humans = []

n = int(input())
for i in range (n):
    name = str(input())
    gender = input()[0]

    humans.append(Human(name, gender))

print()
print("Automatic output : ")
print("The first human's name is", rain.get_name())
print("Now, ", end= ' ')
rain.eat()
print("The second human's name is", techi.get_name())
print("Now, ", end= ' ')
techi.sleep()

i = 0
print("Iteration output : ")
for human in humans:
    print(str(i + 1) + ". ", human.get_name(), "|", human.get_gender())
    i += 1
