#include <stdio.h>
#include <wchar.h>

int main() {
    

    for(int i = 65; i <= 90; i++){
        
        printf("%c ",i);
        // printf("%c",65);
    }
    printf("\n");
    for(int i = 97; i <= 122; i++){
        
        printf("%c ",i);
        // printf("%c",65);
    }
    printf("\n");
    for(int i = 48; i <= 57; i++){
        
        printf("%c ",i);
        // printf("%c",65);
    }
    
    printf("\nnull character ('\\0') %c\n", 0);
    printf("\nAt symble %c\n", 64);
    printf("Unicode character: \u00A9\n"); // Prints the copyright symbol (©)
    //include<wchar.h>
    
    wprintf(L"Unicode character: %lc\n", L'\u00A9'); // Prints the copyright symbol (©)
    printf("Smiling Face with Open Mouth: 😄\n"); // Prints the laughing emoji (😄)
    printf("Unicode character: \u0950\n");
// L'\u0950'
    

    return 0;
}



Output is:

// A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
// a b c d e f g h i j k l m n o p q r s t u v w x y z 
// 0 1 2 3 4 5 6 7 8 9 
// null character ('\0') 

// At symble @
// Unicode character: ©
// Smiling Face with Open Mouth: 😄
// Unicode character: ॐ



