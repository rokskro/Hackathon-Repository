

/** @type {import('next').NextConfig} */
const nextConfig = {
    reactStrictMode: true,
    output: 'export',
    images: {
      unoptimized: true,
    },
    async rewrites() {
      return [
        {
          source: '/e3docs/:path*',
          destination: 'http://localhost:8080/e3docs/:path*',
        },
      ]
    },
  }
  export default nextConfig


//   module.exports = nextConfig
