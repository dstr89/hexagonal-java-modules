module hr.dstr89.hexagonal.infrastructure {
    requires java.sql;
    requires org.slf4j;
    requires lombok;
    requires hr.dstr89.hexagonal.application;
    requires hr.dstr89.hexagonal.domain;

    exports hr.dstr89.hexagonal.infrastructure;
}
