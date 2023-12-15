import unittest
from PasswordChecker import validate_password

class TestPasswordChecker(unittest.TestCase):
    def test_password_length(self):
        assert validate_password('aBc123!') == False

    def test_password_uppercase(self):
        assert validate_password('abcdefgh!') == False

    def test_password_lowercase(self):
        assert validate_password('ABCDEFGH!') == False

    def test_password_digit(self):
        assert validate_password('abcDEFGH!') == False

    def test_password_special(self):
        assert validate_password('abcdefgh1') == False

    def test_password_valid(self):
        assert validate_password('aBc1234!') == True


if __name__ == '__main__':
    unittest.main()     