# korma-drift-template

Example templates for using Drift migrations with Korma and
PostgreSQL >= 9.0.

## Usage
Copy the file `src/config/migrate_config.clj` to your project and edit the
database connection credentials as appropriate.

When you run the migrations, a table called `schema_version` will be
created in your database, containing a `version` integer column and a
`created_at` timestamp column. The current schema version of the
database is defined as the `version` given in the row with the most
recent `created_at` timestamp, or 0 if there are no rows in the
table.

Place migrations in `src/migrations`. An empty migration example,
`001_base_schema.clj`, is provided.

See also https://github.com/macourtney/drift for details on how Drift
works.

Pull requests with enhancements are welcome. :)


## License

Copyright © 2012 Paul Legato. http://www.paullegato.com/

Distributed under the Eclipse Public License, the same as Clojure.
