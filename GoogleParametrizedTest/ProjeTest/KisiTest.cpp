#include "KisiTest.h"

// Nesne oluşturulmadan çağrılan setup fonksiyon
void KisiTest::SetUpTestCase() {
	ortakKisi = new Kisi(50);
}
// Nesne yıkıldıktan sonra çağrılan teardown metodu
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

