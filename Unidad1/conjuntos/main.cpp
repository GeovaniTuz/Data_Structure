#include <iostream>
#include "Conjuntos.h"
#include <stdlib.h>
#include<string>
using namespace std;

int main()
{

    int num = 10;
    int conjuntoA[num];
    int conjuntoB[num];

    cout << "ingresa diez numeros mayores he igual a cero"<< endl;

    cout << "conjunto A "<< endl;
    for(int i=0; i<num; i++){
        cin >> conjuntoA[i];
        cout << "\n";
    }
    cout << "conjunto B"<< endl;
    for(int j=0; j<num; j++){
        cin >> conjuntoB[j];
        cout << "\n";
    }

    system("cls");

    Conjuntos C;

    C.lista(conjuntoA, conjuntoB);

    int op;
    cout << "OPERACION DE CONJUNTOS"<< endl;
    cout << "1. UNION "<< endl;
    cout << "2. INTERSECCIÓN "<< endl;
    cout << "3. DIFERNCIA SIMETRICA "<< endl;
    cout << "4. PERTENECE NUMERO "<< endl;
    cout << "5. RETIRAR NUMERO "<< endl;
    cout << "6. SALIR "<< endl;
    cin >> op;
    switch(op){

    case 1:
        system("cls");
            cout << "1. UNION "<< endl;
            cout << "LA UNION ES "<< endl;
            C.Union(conjuntoA, conjuntoB);
    break;
    case 2:
        system("cls");
            cout << "2. INTERSECCION "<< endl;
            cout << "LA INTERSECCION ES"<< endl;
            C.Interseccion(conjuntoA, conjuntoB);
    break;
    case 3:
        system("cls");
        cout << "3. DIFERNCIA "<< endl;

        C.Diferencia(conjuntoA, conjuntoB);
    break;
    case 4:
        system("cls");
        int c;
        cout << "4. PERTENECE NUMERO "<< endl;
        cout << "1. CONJUNTO A "<< endl;
        cout << "2. CONJUNTO B "<< endl;
        cin >> c;
        if(c==1){
            int a;
            cout << "NUMERO QUE QUIERE BUCAR "<< endl;
            cin >> a;
            C.Setnumero(a);
            C.PerteneceAlConjunto(conjuntoA);
        }else{
            int b;
            cout << "NUMERO QUE QUIERE BUCAR "<< endl;
            cin >> b;
            C.Setnumero(b);
            C.PerteneceAlConjunto(conjuntoB);
        }
    break;
    case 5:
        system("cls");

        cout << "4. RETIRAR NUMERO "<< endl;
        cout << "1. CONJUNTO A "<< endl;
        cout << "2. CONJUNTO B "<< endl;
        cin >> c;
        if(c==1){
            int a;
            cout << "INTRODUZCA EL NUMERO A RETIRAR "<< endl;
            cin >> a;
            C.Setnumero(a);
            C.RetirarElemento(conjuntoA);
        }else{
            int x;
            cout << "INTRODUZCA EL NUMERO A RETIRAR "<< endl;
            cin >> x;
            C.Setnumero(x);
            C.RetirarElemento(conjuntoB);
            }
            break;
    }



return 0;
}
