import {
  createStyles,
  Container,
  Button,
  Title,
  Text,
  rem,
} from "@mantine/core";
import { IconCalendarEvent, IconExternalLink } from "@tabler/icons-react";

const useStyles = createStyles((theme) => ({
  wrapper: {
    position: "relative",
    paddingTop: rem(120),
    paddingBottom: rem(80),

    [theme.fn.smallerThan("sm")]: {
      paddingTop: rem(80),
      paddingBottom: rem(60),
    },
  },

  inner: {
    position: "relative",
    zIndex: 1,
  },

  dots: {
    position: "absolute",
    color:
      theme.colorScheme === "dark"
        ? theme.colors.dark[5]
        : theme.colors.gray[1],

    [theme.fn.smallerThan("sm")]: {
      display: "none",
    },
  },

  dotsLeft: {
    left: 0,
    top: 0,
  },

  title: {
    textAlign: "center",
    fontWeight: 900,
    fontSize: rem(50),
    letterSpacing: -1,
    color: theme.colorScheme === "dark" ? theme.white : theme.black,
    marginBottom: theme.spacing.xs,
    fontFamily: `Greycliff CF, ${theme.fontFamily}`,

    [theme.fn.smallerThan("xs")]: {
      fontSize: rem(42),
      textAlign: "left",
    },
  },

  highlight: {
    color:
      theme.colors[theme.primaryColor][theme.colorScheme === "dark" ? 4 : 6],
  },

  description: {
    textAlign: "center",
    fontSize: rem(18),

    [theme.fn.smallerThan("xs")]: {
      textAlign: "left",
    },
  },

  controls: {
    marginTop: theme.spacing.lg,
    display: "flex",
    justifyContent: "center",

    [theme.fn.smallerThan("xs")]: {
      flexDirection: "column",
    },
  },

  control: {
    marginLeft: theme.spacing.md,

    [theme.fn.smallerThan("xs")]: {
      height: rem(42),
      fontSize: theme.fontSizes.md,
      marginTop: theme.spacing.md,
      marginLeft: 0,
    },
  },
}));

export function HeroBullets() {
  const { classes } = useStyles();
  return (
    <div>
      <Container className={classes.wrapper} size={1400}>
        <div className={classes.inner}>
          <Title className={classes.title}>
            Build{" "}
            <Text component="span" className={classes.highlight} inherit>
              Interactive
            </Text>{" "}
            Demos for your API
          </Title>

          <Container p={0} size={600}>
            <Text size="lg" color="dimmed" className={classes.description}>
              Konfig makes it easy for you to impress buyers with your API.
              Easily build interactive notebook-style demos that are runnable in
              the browser.
            </Text>
          </Container>

          <div className={classes.controls}>
            <Button
              className={classes.control}
              size="lg"
              variant="default"
              color="gray"
              target="_blank"
              component="a"
              href="https://calendly.com/anhtuan-2/30min"
              leftIcon={<IconCalendarEvent />}
            >
              Book a demo
            </Button>
            <Button
              component="a"
              href="https://demo.konfigthis.com/konfig-dev/konfig-demo-docs"
              target="_blank"
              className={classes.control}
              leftIcon={<IconExternalLink />}
              size="lg"
            >
              Try it yourself
            </Button>
          </div>
        </div>
      </Container>
    </div>
  );
}
