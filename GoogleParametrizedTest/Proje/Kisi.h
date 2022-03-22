#pragma once
class Kisi
{
private:
	double kilo;

public:
	Kisi(double kl = 60);
	void YemekYe(double);
	double getKilo()const;
	void kos(double);
	~Kisi();
};

