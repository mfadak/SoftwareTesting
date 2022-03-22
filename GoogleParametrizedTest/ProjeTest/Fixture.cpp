#include "Fixture.h"



Fixture::Fixture()
{
	int rastgeleKilo = rand() % 100 + 1;
	arac = new Arac(new Kisi(rastgeleKilo));
	Kisi rakip = GetParam();
	kazandi = arac->driftYap(rakip);
}

void Fixture::SetUpTestCase()
{
	srand(time(NULL));
}

TEST_P(Fixture, DriftTest) {
	ASSERT_TRUE(kazandi);
}

INSTANTIATE_TEST_CASE_P(
	Arac, Fixture, ::testing::Values(Kisi(75), Kisi(54), Kisi(36));
);

Fixture::~Fixture()
{
}
