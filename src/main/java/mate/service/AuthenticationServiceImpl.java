package mate.service;

import java.util.Optional;
import mate.exception.AuthenticationException;
import mate.lib.Inject;
import mate.lib.Service;
import mate.model.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private static final Logger logger = LogManager.getLogger(AuthenticationServiceImpl.class);
    @Inject
    private DriverService driverService;

    @Override
    public Driver login(String login, String password) throws AuthenticationException {
        logger.info("Method login was called. Params: login = {}", login);
        Optional<Driver> driver = driverService.findByLogin(login);
        if (driver.isEmpty()
                || !driver.get().getPassword().equals(password)) {
            logger.error("Failed to authenticate. Incorrect login and/or password. login = {}",
                    login);
            throw new AuthenticationException("Login or password was incorrect");
        }
        return driver.get();
    }
}
