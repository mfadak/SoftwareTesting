#include "Arac.h"



Arac::Arac(Kisi *surucu)
{
	this->surucu = surucu;
}

void Arac::sur(double km)
{
	surucu->kos(2 * km);
}


Arac::~Arac()
{
}
