# // THIRD PROGRAMMING EXERCISE //
# // SUBMITTED BY: ANDREI N. CAPILI (BSCPE 1-1 - PUP BC) //
# // DISTANCE TRAVELED (DISTANCE CALCULATOR) //

def main():
    name = inputName()
    introText(name)
    calculateEnglish()
    calculateMetric()

def inputName(name):
    name = input("Hi! What's your name?: ")
    return name

def introText():
    print("Greetings! " + name + ", This program will help you calculate the distance traveled.")
    print("All you need to do is provide the necessary information below.")
    print("")

def calculateEnglish(hours, hourCounter, speed, loop):
    print("Enter the speed of the vehicle in kilometers per hour (mp/h)")
    speed = (int(input("")))
    print("Enter the amount of hours the vehicle has traveled")
    hours = (int(input("")))

    while loop < hours+1:
        if(loop == 1):
            loop +=1
            hourCounter +=1
            print(hourCounter, " Hour ", "           ", (speed*hourCounter), " Miles")
        else:
            loop +=1
            hourCounter +=1
            print(hourCounter, " Hours ", "          ", (speed*hourCounter), " Miles")

def calculateMetric(hours, hourCounter, speed, loop):
    print("Enter the speed of the vehicle in kilometers per hour (km/h)")
    speed = (int(input("")))
    print("Enter the amount of hours the vehicle has traveled")
    hours = (int(input("")))

    while loop < hours+1:
        if(loop == 1):
            loop +=1
            hourCounter +=1
            print("Time Spent                  Distance Traveled");
            print("_____________________________________________");

            print(hourCounter, " Hour ", "           ", (speed*hourCounter), " Kilometers")
        else:
            loop +=1
            hourCounter +=1
            print(hourCounter, " Hours ", "          ", (speed*hourCounter), " Kilometers")

name = (str(""))
hours = 0
speed = 0
hourCounter = 0
loop = 1

name = inputName(name)
introText()
try:

    print("Type 1 for metric or 2 for english units")
    unit = (int(input("")))

    if(unit == 1):
        print("")
        calculateMetric(hours, hourCounter, speed, loop)
    elif(unit == 2):
        print("")
        calculateEnglish(hours, hourCounter, speed, loop)
except:
    print("Invalid input. Please rerun the program")





































