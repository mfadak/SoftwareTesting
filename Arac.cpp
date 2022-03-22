#include "Arac.h"

Arac::Arac(Kisi *surucu)
{
	this->surucu = surucu;
}

void Arac::sur(double km)
{
	surucu->kos(2 * km);
}

bool Arac::driftYap(Kisi rakip)
{
	//Eğer drift yarışı olursa surucu kazanır mı?
	int buSurucu = rand() % (int)(surucu->getKilo()) + 1;
	int rakipSurucu = rand() % (int)(rakip.getKilo()) + 1;
	return buSurucu < rakipSurucu;

}

Arac::~Arac()
{
}
