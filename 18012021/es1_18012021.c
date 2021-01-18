#include <stdio.h>

#define S_MAX 30

struct Prodotto {
  char  nome[S_MAX];
  float prezzo;
  int   quantita;
};

int main(int argc, char *argv[]) {
  int size = 0,
         i = 0;

  printf("\nInserire numero prodotti: ");
  scanf("%d", &size);
  
  struct Prodotto p[size];

  for (i = 0; i < size; ++i) {
    getchar();
    printf("\nInserire nome prodotto %d: ", i+1);
    fgets(p[i].nome, S_MAX, stdin);

    printf("\nInserire prezzo prodotto %d: ", i+1);
    scanf("%f", &p[i].prezzo);

    printf("\nInserire quantita\' prodotto %d: ", i+1);
    scanf("%d", &p[i].quantita);
  }

  for (i = 0; i < size; ++i) {
    printf("\nProdotto %d:", i+1);
    printf("\n|-Nome: %s", p[i].nome);
    printf("|-Prezzo: %.2f", p[i].prezzo);
    printf("\n|-Quantita\': %d", p[i].quantita);
    printf("\n|-Prezzo Totale: %.2f\n", p[i].prezzo*((float)p[i].quantita));
  }
  
  return 0;
}
