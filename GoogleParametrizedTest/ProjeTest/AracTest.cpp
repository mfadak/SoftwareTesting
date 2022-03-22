#include "AracTest.h"



AracTest::AracTest()
{
	surucu = new Kisi(50);
	arac = new Arac(surucu);
}

TEST_F(AracTest, SurTest) {
	arac->sur(500);
	ASSERT_EQ(49, surucu->getKilo());
}


AracTest::~AracTest()
{
	delete surucu;
	delete arac;
}
