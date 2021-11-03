from car import Car

if __name__ == "__main__":
    print("Hello World!")
    car = Car()
    car.license = "AMD222"
    car.driver  = "Juan Perez"
    print(vars(car))

    car2 = Car()
    car2.license = "LLC004"
    car2.driver  = "Maria Lopez"
    print(vars(car2))