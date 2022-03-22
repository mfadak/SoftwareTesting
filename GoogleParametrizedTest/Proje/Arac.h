#pragma once
#include "Kisi.h"
#include <stdlib.h>
class Arac
{
private:
	Kisi* surucu;
public:
	Arac(Kisi*);
	void sur(double);
	bool driftYap(Kisi);
	~Arac();
};
