class Human:
    __name = ""
    __gender = ''

    def __init__(self, name = "", gender = ''):
        self.__name = name
        self.__gender = gender

    def get_name(self):
        return self.__name
    
    def set_name(self, name):
        self.__name = name

    def get_gender(self):
        return self.__gender
    
    def set_gender(self, gender):
        self.__gender = gender

    def eat(self):
        print(self.__name, "is eating!")

    def sleep(self):
        print(self.__name, "is sleeping!")