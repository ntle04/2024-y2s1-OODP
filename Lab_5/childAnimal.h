#include <iostream>
#include <string>
#include "animal.h"

using namespace std;

class Dog: public Mammal{
    public:

        Dog():Mammal(){
            _owner = "Unknown";
            cout << "Constructing Dog object " << _name << endl;
        }
        
        Dog(const string n, const COLOR c, string owner): Mammal(n, c){
            _owner = owner;
            cout << "constructing Dog object " << n  << endl;
        }

        ~Dog(){
            cout << "destructing Dog object " << _name << endl;
        }

        void speak();

        void move();

        void eat();

    private:
        string _owner;
};

class Cat: public Mammal{
    public:
        Cat():Mammal(){
            _owner = "Unknown";
            cout << "Constructing Cat object " << _name << endl;
        }

        Cat(const string n, const COLOR c, string owner): Mammal(n, c){
            _owner = owner;
            cout << "constructing Cat object " << n  << endl;
        }

        ~Cat(){
            cout << "destructing Cat object " << _name << endl;
        }

        void speak();

        void move();

        void eat();

    private:
        string _owner;
};

class Lion: public Mammal{
    public:
        Lion():Mammal(){
            _owner = "Unknown";
            cout << "Constructing Lion object " << _name << endl;
        }

        Lion(const string n, const COLOR c, string owner): Mammal(n, c){
            _owner = owner;
            cout << "constructing Lion object " << n  << endl;
        }

        ~Lion(){
            cout << "destructing Lion object " << _name << endl;
        }

        void speak();

        void move();

        void eat();

    private:
        string _owner;
};



