/* g++ Animal.cpp --> .\Animal_n.exe*/  

#include <iostream>
#include <string>

using namespace std;

enum COLOR { Green, Blue, White, Black, Brown };

class Animal {
    public:
        Animal(): _name("unknown"){
            cout << "constructing Animal object "<< _name << endl;
        }
        
        ~Animal() {
            cout << "destructing Animal object "<< _name << endl;
        }

        Animal(string n, const COLOR &c): _name(n), _color(c){
            cout << "constructing " << COLOR(_color) << " " << _name << endl;
        }

        virtual void speak() const {
            cout << "Animal speaks "<< endl;
        }

        virtual void move() const = 0;
    
    private:
        COLOR _color;
    protected:
        string _name;
};

class Mammal: public Animal{
    public:
        void eat() const{
            cout << "Mammal eats " << endl;
        }
        
        Mammal(const string n, const COLOR c) : Animal(n, c){
            cout << "constructing Mammal object " << n << endl;
        }

        ~Mammal(){
            cout << "destructing Mammal object " << _name << endl;
        }

        virtual void speak() const{
            cout << "Mammal speaks " << endl;
        }

        virtual void move() const override{
            cout << "Mammal moves" << endl;
        }
};

class Dog: public Mammal{
    public:

        Dog(const string n, const COLOR c, string owner): Mammal(n, c){
            _owner = owner;
            cout << "constructing Dog object " << n  << endl;
        }

        ~Dog(){
            cout << "destructing Dog object " << _name << endl;
        }

        virtual void speak() const override{
            cout << "Woof " << endl;
        }

        void move() const override{
            cout << "Dog moves" << endl;
        }

    private:
        string _owner;
};

int main(){

    Mammal m("cat", Blue);
    m.speak();

    cout << "" << endl;

    Dog d("spot", Green, "John");
    d.speak();

    cout << "" << endl;

    Animal *animalPtr = new Dog("Lassie", White, "Andy");
    animalPtr->speak();
    animalPtr->move();
    delete animalPtr;

    cout << "" << endl;

    Dog dogi("Lassie", White, "Andy");
    Mammal *aniPtr = &dogi;
    Mammal &aniRef = dogi;
    Mammal aniVal = dogi;

    aniPtr->speak();
        aniRef.speak();
            aniVal.speak();

    cout << "Program exiting ... "<< endl;
    return 0;
}
