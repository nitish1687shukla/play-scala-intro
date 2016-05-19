var context = require.context('./test/assets', true, /-spec\.js$/);
context.keys().forEach(context);
console.log(context.keys());

