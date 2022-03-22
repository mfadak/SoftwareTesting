#include "KisiTest.h"

// Nesne olu�turulmadan �a�r�lan setup fonksiyon
void KisiTest::SetUpTestCase() {
	ortakKisi = new Kisi(50);
}
// Nesne y�k�ld�ktan sonra �a�r�lan teardown metodu
void KisiTest::TearDownTestCase() {
	delete ortakKisi;
}

TEST_F(KisiTest, YemekYe) {
	ortakKisi->YemekYe(1000);
	ASSERT_EQ(51, ortakKisi->getKilo());
}
TEST_F(KisiTest, Kos) {
	ortakKisi->kos(2000);
	ASSERT_EQ(49, ortakKisi->getKilo());
}

