#include "Kisi.h"

Kisi::Kisi(double kl)
{
	kilo = kl;
}

void Kisi::YemekYe(double kalori)
{
	kilo += kalori / 1000;
}

double Kisi::getKilo() const
{
	return kilo;
}

void Kisi::kos(double metre)
{
	kilo -= (metre / 1000);
}

Kisi::~Kisi()
{
}
