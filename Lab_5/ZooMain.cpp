#include <iostream>
#include "childAnimal.h"

using namespace std;

void Animal::speak(){
    cout << "Animal speaks" << endl;
}

void Animal::move(){
    cout << "Animal moves" << endl;
}

void Mammal::eat(){
    cout << "Mammal eats" << endl;
} 

void Mammal::move(){
    cout << "Mammal moves" << endl;
}

void Dog::speak(){
    cout << "Woof" << endl;
}

void Dog::eat(){
    cout << "Dog eats" << endl;
}

void Dog::move(){
    cout << "Dog moves" << endl;
}

void Cat::speak(){
    cout << "Meow" << endl;
}

void Cat::eat(){
    cout << "Cat eats" << endl;
}

void Cat::move(){
    cout << "Cat moves" << endl;
}

void Lion::speak(){
    cout << "Roar" << endl;
}

void Lion::eat(){
    cout << "Lion eats" << endl;
}

void Lion::move(){    
    cout << "Lion moves" << endl;
}

int main(){
    int choice = 0;
    Mammal **mammal = new Mammal*[3];
    mammal[0] = new Dog();
    mammal[1] = new Cat();
    mammal[2] = new Lion();

    do{
        cout << "Select animal from list" << endl;
        cout << "(1) Dog (2) Cat (3) Lion (4) Move all animals (5) Quit" << endl;
        cin >> choice;
        
        switch(choice){
            case 1:
                mammal[0]->move();
                mammal[0]->speak();
                mammal[0]->eat();
                break;
            case 2:
                mammal[1]->move();
                mammal[1]->speak();
                mammal[1]->eat();
                break;
            case 3:
                mammal[2]->move();
                mammal[2]->speak();
                mammal[2]->eat();
                break;
            case 4:
                for(int i=0; i<3; i++){
                    mammal[i]->move();
                    mammal[i]->speak();
                    mammal[i]->eat();
                }
                break;
        }
    } while(choice != 5);
    
    for(int i=0; i<3; i++){
        delete mammal[i];
    }
    delete [] mammal;

    cout << "Program exiting …. "<< endl ;

    return 0;
    return 0;
}