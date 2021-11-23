import pytest

def test_sum():
    num1 = 20
    num2 = 30
    sum = num1+num2

    assert sum == 50

def test_diff():
    num1 = 150
    num2 = 100

    diff = num1-num2

    assert diff ==50
@pytest.mark.activity
def test_prod():
    num1 = 25
    num2 = 25

    prod = num1*num2

    assert prod == 625
@pytest.mark.activity
def test_div():
    num1 = 250
    num2 = 25

    div = num1/num2

    assert div == 10