import { checkPassword } from './PasswordChecker.js';

describe('checkPassword', () => {

    const sut = checkPassword

    test('throws an error if password is not a string', () => {
        expect(() => sut(12345678)).toThrow('Password must be a string');
    });
    test('throws an error if password is less than 8 characters', () => {
        expect(() => sut('abc123')).toThrow('Password must be at least 8 characters');
    });
    test('throws an error if password does not contain a lowercase letter', () => {
        expect(() => sut('ABC12345')).toThrow('Password must contain at least one lowercase letter');
    });
    test('throws an error if password does not contain an uppercase letter', () => {
        expect(() => sut('abc12345')).toThrow('Password must contain at least one uppercase letter');
    });
    test('throws an error if password does not contain a number', () => {
        expect(() => sut('abcABCabc')).toThrow('Password must contain at least one number');
    });
    test('throws an error if password does not contain a special character', () => {
        expect(() => sut('abcABC123')).toThrow('Password must contain at least one special character');
    });
    test('does not throw an error if password is valid', () => {
        expect(() => sut('abcABC123!')).not.toThrow();
    });
});