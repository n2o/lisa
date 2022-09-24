# blog

[![Deploy with Vercel](https://vercel.com/button)](https://vercel.com/new/clone?repository-url=https%3A%2F%2Fgithub.com%2Fn2o%2Fblog)

Build a blog using "Clojure on node.js" [`nbb`](https://github.com/babashka/nbb),
with reactjs for your components. Generates static HTML files.

## Development

This project requires [`nbb`](https://github.com/babashka/nbb) for interactive
development. For "I know what I am doing and I don't need a REPL"-development,
you can just build the project using yarn.

### Dependencies

Install dev dependencies with:

    yarn

### Tailwind

Start tailwindcss:

    yarn tailwind:watch

## Deployment

This build produces the HTML-files and generates then the CSS from the output:

    yarn build
