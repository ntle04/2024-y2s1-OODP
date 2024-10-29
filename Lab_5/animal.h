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

        virtual void speak();

        virtual void move() = 0;
    
    private:
        COLOR _color;
    protected:
        string _name;
};

class Mammal: public Animal{
    public:
        Mammal(){
            cout << "constructing Mammal object " << _name << endl;
        }


        Mammal(const string n, const COLOR c) : Animal(n, c){
            cout << "constructing Mammal object " << n << endl;
        }

        ~Mammal(){
            cout << "destructing Mammal object " << _name << endl;
        }

        virtual void move();
        virtual void eat();
};