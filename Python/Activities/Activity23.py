import pytest

'''@pytest.fixture()
def inp_val():
    a = [1,2,3,4,5,6,7,8,9,10]
    return a
'''
def test_tot_sum(inp_val):
    sum = 0

    for i in inp_val:
        sum += i
    
    assert sum == 55
