#include "pch.h"

TEST(KisiTest, YemekYeTest) {
	Kisi* k = new Kisi(50);
	k->YemekYe(1000);
	ASSERT_EQ(51, k->getKilo());
	delete k;
}
TEST(KisiTest, KosTest) {
	Kisi* k = new Kisi(50);
	k->kos(2000);
	ASSERT_EQ(48, k->getKilo());
	delete k;
}
TEST(AracTest, SurTest) {
	Kisi* surucu = new Kisi(50);
	Arac* arac = new Arac(surucu);
	arac->sur(500);
	ASSERT_EQ(49, surucu->getKilo());
	delete surucu;
	delete arac;
}