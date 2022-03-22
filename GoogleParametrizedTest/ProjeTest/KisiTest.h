#include "pch.h"
#pragma once
class KisiTest : public ::testing::Test
{
protected:
	static void SetUpTestCase();
	static void TearDownTestCase();

	static Kisi* ortakKisi;

};
Kisi* KisiTest::ortakKisi = NULL;

