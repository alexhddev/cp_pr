export function checkPassword(password) {
    if (typeof password !== 'string') {
        throw new Error('Password must be a string');
    }
    if (password.length < 8) {
        throw new Error('Password must be at least 8 characters');
    }
    if (!password.match(/[a-z]/)) {
        throw new Error('Password must contain at least one lowercase letter');
    }
    if (!password.match(/[A-Z]/)) {
        throw new Error('Password must contain at least one uppercase letter');
    }
    if (!password.match(/[0-9]/)) {
        throw new Error('Password must contain at least one number');
    }
    if (!password.match(/[^a-zA-Z0-9!]/)) {
        throw new Error('Password must contain at least one special character');
    }
}

export function checkPasswordWithoutReqEx(password) {
    if (typeof password !== 'string') {
        throw new Error('Password must be a string');
    }
    if (password.length < 8) {
        throw new Error('Password must be at least 8 characters');
    }
    let hasLowercase = false;
    let hasUppercase = false;
    let hasNumber = false;
    let hasSpecialChar = false;
    const specialChars = "!@#$%^&*()_+-=[]{}|;':,.<>?";

    for (let i = 0; i < password.length; i++) {
        const char = password[i];
        if (char >= 'a' && char <= 'z') {
            hasLowercase = true;
        } else if (char >= 'A' && char <= 'Z') {
            hasUppercase = true;
        } else if (char >= '0' && char <= '9') {
            hasNumber = true;
        } else if (specialChars.includes(char)) {
            hasSpecialChar = true;
        }
    }

    if (!hasLowercase) {
        throw new Error('Password must contain at least one lowercase letter');
    }
    if (!hasUppercase) {
        throw new Error('Password must contain at least one uppercase letter');
    }
    if (!hasNumber) {
        throw new Error('Password must contain at least one number');
    }
    if (!hasSpecialChar) {
        throw new Error('Password must contain at least one special character');
    }
}