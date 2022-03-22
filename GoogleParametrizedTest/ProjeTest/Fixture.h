#pragma once
#include "pch.h"
class Fixture : public ::testing::TestWithParam<Kisi>
{
public:
	Arac* arac;
	bool kazandi;
	Fixture();
	static void SetUpTestCase();
	~Fixture();
};

