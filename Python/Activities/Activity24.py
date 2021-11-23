import pytest

@pytest.fixture()
def wallet():
    wallet_amt = 0
    return wallet_amt

@pytest.mark.parametrize("earned, spent, expected",[(30,20,10), (20,2,18)])

def test_earned(wallet, earned, spent, expected):
    ## earned amount
    wallet += earned

    ## spent amount

    wallet -= spent

    assert wallet == expected




