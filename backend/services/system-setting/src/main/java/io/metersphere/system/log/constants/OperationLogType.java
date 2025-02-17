package io.metersphere.system.log.constants;

public enum OperationLogType {
    ADD,
    DELETE,
    UPDATE,
    DEBUG,
    REVIEW,
    COPY,
    EXECUTE,
    SHARE,
    RESTORE,
    IMPORT,
    EXPORT,
    LOGIN,
    SELECT,
    RECOVER,
    LOGOUT;

    public boolean contains(OperationLogType keyword) {
        return this.name().contains(keyword.name());
    }
}
